package com.cmdzz.test;

import com.cmdzz.dao.IUserDao;
import com.cmdzz.domain.QueryVo;
import com.cmdzz.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.rmi.server.UnicastServerRef;

import javax.swing.text.StyledEditorKit;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author cmdzz
 * @date 2019/6/26 - 17:21
 */
public class MybatisTest {


    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /**
    * 测试查询所有
    */
    @Test
    public void testFindAll() {

        //5.执行查询所有方法
        List<User> users = userDao.findAll();
        for(User user:users){
            System.out.println(user);
        }

    }


    /**
     * 测试查询一个操作
     */
    @Test
    public void testFindOne(){
        //5.执行查询一个方法
        User  user = userDao.findById(50);
        System.out.println(user);
    }

    /**
     * 测试模糊查询操作
     */
    @Test
    public void testFindByName(){
        //5.执行查询一个方法
        List<User> users = userDao.findByName("%王%");
//        List<User> users = userDao.findByName("王");
        for(User user : users){
            System.out.println(user);
        }
    }


    /**
     * 测试使用QueryVo作为查询条件
     */
    @Test
    public void testFindByVo(){
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUserName("%王%");
        vo.setUser(user);
        //5.执行查询一个方法
        List<User> users = userDao.findUserByVo(vo);
        for(User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void testFindByCondition() {
        User user = new User();
        user.setUserName("老王");
        user.setSex("女");
        List<User> users = userDao.findUserByConditon(user);

        for (User u : users) {
            System.out.println(u);
        }
    }


    /**
     * 测试foreach标签的使用
     */
    @Test
    public void testFindInIds() {
      QueryVo vo = new QueryVo();
      List<Integer> list = new ArrayList<Integer>();
      list.add(41);
      list.add(42);
      list.add(43);
      vo.setIds(list);

      List<User> users = userDao.findUserInIds(vo);
      for(User u : users){
          System.out.println(u);
      }


    }


}

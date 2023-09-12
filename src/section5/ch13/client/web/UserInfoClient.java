package section5.ch13.client.web;

import section5.ch13.domain.userInfo.UserInfo;
import section5.ch13.domain.userInfo.dao.UserInfoDao;
import section5.ch13.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import section5.ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/section5/db.properties");
        Properties properties = new Properties();
        properties.load(fis);

        String dbType = properties.getProperty("DBTYPE");
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPasswd("!@#$%");
        userInfo.setUserName("이순신");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMysqlDao();
        }else{
            System.out.println("db support error");
        }

        if (userInfoDao != null) {
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }
    }
}

package pl.coderslab.entity;

public class MainDao {

    public static void main(String[] args) {



       //test1
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("Jan");
        user.setEmail("jan@coderslab.pl");
        user.setPassword("haslo");
        userDao.create(user);


        //test2
        User read = userDao.read(8);
        System.out.println(read);

        User readNotExist = userDao.read(2);
        System.out.println(readNotExist);


        //test3
        User userToUpdate = userDao.read(1);
        userToUpdate.setUserName("Jan");
        userToUpdate.setEmail("john@coderslab.pl");
        userToUpdate.setPassword("123456");
        userDao.update(userToUpdate);


        //test4
        User secondUser = new User();
        secondUser.setUserName("Bruce");
        secondUser.setEmail("bruce@coderslab.pl");
        secondUser.setPassword("password");
        userDao.create(secondUser);
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }


        //test5
        userDao.delete(8);
        userDao.delete(2);





    }
}
import DAO.impl.Userimpl;
import vo.User;

public class test {
    public static void main(String[] args) {
        User user = new User();
        user.setName("ddddf");
        user.setPassword("nnnnnn");
        user.setPhone("213123");
        user.setSex(1);

        new Userimpl().InsertUser(user);
    }
}

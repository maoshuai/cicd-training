package unit.test.challenge;

import unit.test.challenge.support.User;

public class UserService {
    //请创建测试类，为方法getDiscount编写测试用例
    //当我反转if else，或改变数值60，0.5，1等时，测试用例能捕获到错误
    public double getDiscount(User user) {
        if (user.getAge() >= 60) {
            return 0.5;
        } else {
            return 1;
        }
    }
}

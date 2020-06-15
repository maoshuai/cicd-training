package unit.test.challenge;

import unit.test.challenge.support.SmsService;
import unit.test.challenge.support.User;

public class RegisterService {

    //请创建测试类，为方法register编写足够多的单元测试用例
    //当我反转if else，或则注释掉smsService.send(user)时，测试用例能捕获到错误
    //若发现完成有困难时，请搜索关键词"依赖注入"等技巧
    private SmsService smsService = new SmsService();

    public RegisterService(SmsService smsService) {
        this.smsService = smsService;
    }

    void register(User user) {
        if (user.getPhone() != null) {
            smsService.send(user);
        }
    }
}

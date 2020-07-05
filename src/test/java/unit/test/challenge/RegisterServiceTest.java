package unit.test.challenge;

import org.junit.jupiter.api.Test;
import unit.test.challenge.support.SmsService;
import unit.test.challenge.support.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RegisterServiceTest {

    @Test
    public void should_not_send_sms_given_user_without_phone(){
        SmsService smsService = mock(SmsService.class);

        User user = new User();
        user.setPhone(null);

        RegisterService registerService = new RegisterService(smsService);
        registerService.register(user);

        verify(smsService, never()).send(user);
    }

    @Test
    public void should_send_one_sms_given_user_with_phone(){
        SmsService smsService = mock(SmsService.class);

        User user = new User();
        user.setPhone("1111");

        RegisterService registerService = new RegisterService(smsService);
        registerService.register(user);


        verify(smsService, times(1)).send(user);

    }

}
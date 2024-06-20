package Controller;

import Dto.RegisterDto;
import Model.RegisterModel;

public class RegisterController {
    private RegisterModel registerModel;

    public RegisterController()throws Exception {
        this.registerModel = new RegisterModel();
    }

    public String saveStudent(RegisterDto registerDto) throws Exception {
        String resp=  registerModel.saveStudent(registerDto);
        return resp;
    }
}

package geco;

public class User {

    public String getRandomPassword(){
        PasswordGeneration pwdGen = PasswordGeneration.getInstance();
        return pwdGen.getRandomPassword();
    }

}

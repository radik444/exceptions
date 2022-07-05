public class Check {
    private static final String VALID = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    private Check(){
    }

    public static boolean validate( String login, String password, String confirmPassword) {
                try {
                    verification(login, password, confirmPassword);
                    return true;
                } catch (WrongLoginException | WrongPasswordException e){
                    System.out.println(e.getMessage());
                    return false;
                }
    }





    private static void verification(String login,
                                     String password,
                                     String confirmPassword) throws WrongLoginException,WrongPasswordException {
          if ( login == null || login.length() > 20) {
              throw new WrongLoginException("Длина логина должна быть меньше или равной 20");
          }
          if ( password == null || !password.equals(confirmPassword)) {
              throw new WrongPasswordException("Пароли должны совпадать");
          }
          if (password.length() >= 20) {
              throw new WrongPasswordException("Длина пароля должна быть меньше 20");
          }
          checkCharacter(login, "Логин");
          checkCharacter(password,"Пароль");
        }



        private static void checkCharacter(String s,String what) throws WrongLoginException{
        for (int i = 0; i < s.length(); i++) {
            if (!VALID.contains(String.valueOf(s.charAt(i)))) {
                throw new WrongLoginException(String.format("%s содержит неверный символ %с!", what, s.charAt(i)));
            }
        }

            }




    }


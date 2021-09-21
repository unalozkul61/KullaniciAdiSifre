import java.util.Scanner ;

public class main {

    public static void main(String[] args) {

        String userName, passWord;
        char sifreCevap;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        passWord = input.nextLine();

        if (userName.equals("patika") && passWord.equals("dev")) {
            System.out.println("Sisteme  başarılı bir şekilde giriş yaptınız . ");

        } else {
            System.out.println("Hatalı Şifre Girişi !!!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? E/H : ");
            sifreCevap = input.next().charAt(0);
        }
        if (sifreCevap == 'E') {
            System.out.print("Lütfen Yeni Şifre Giriniz : ");
            String newPassWord = input.next();
            if (newPassWord.equals(passWord) || newPassWord.equals("dev")) {
                System.out.print("Şifre oluşturalamadı!");
            } else {
                System.out.println("Şifre oluşturuldu .");
            }

        } else if (sifreCevap == 'H') {
            System.out.println("Şifre oluşturma  iptal edildi .");
        } else {
            System.out.println("Lütfen  geçerli parametre giriniz : E (Evet ) veya H (Hayır) !!!");
        }



    }
}

}





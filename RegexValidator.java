import java.util.regex.*;

public class RegexValidator {

    // Kiểm tra email
    public boolean isValidEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(regex, email);
    }

    // Kiểm tra số điện thoại
    public boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\d{10,11}";
        return Pattern.matches(regex, phoneNumber);
    }

    // Tìm tất cả các email trong một chuỗi văn bản
    public void findEmailsInText(String text) {
        String regex = "\\w+@\\w+\\.\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Các email tìm thấy trong văn bản:");
        while (matcher.find()) {
            System.out.println("- " + matcher.group());
        }
    }

    // Thay thế ngày từ định dạng dd/mm/yyyy thành yyyy-mm-dd
    public String convertDateFormat(String text) {
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";
        String replacement = "$3-$2-$1";
        return text.replaceAll(regex, replacement);
    }
}

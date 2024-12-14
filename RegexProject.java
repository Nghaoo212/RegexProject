import java.util.Scanner;

public class RegexProject {
    public static void main(String[] args) {
        RegexValidator validator = new RegexValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Demo Regex trong Java ===");

        // Kiểm tra email
        System.out.print("Nhập email cần kiểm tra: ");
        String email = scanner.nextLine();
        if (validator.isValidEmail(email)) {
            System.out.println("Email hợp lệ!");
        } else {
            System.out.println("Email không hợp lệ!");
        }

        // Kiểm tra số điện thoại
        System.out.print("\nNhập số điện thoại cần kiểm tra: ");
        String phoneNumber = scanner.nextLine();
        if (validator.isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ!");
        } else {
            System.out.println("Số điện thoại không hợp lệ!");
        }

        // Tìm email trong văn bản
        System.out.print("\nNhập đoạn văn bản chứa email: ");
        String text = scanner.nextLine();
        validator.findEmailsInText(text);

        // Chuyển định dạng ngày
        System.out.print("\nNhập văn bản chứa ngày (dd/mm/yyyy): ");
        String dateText = scanner.nextLine();
        String convertedText = validator.convertDateFormat(dateText);
        System.out.println("Văn bản sau khi chuyển định dạng ngày:");
        System.out.println(convertedText);

        scanner.close();
    }
}

package a0326.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class optional2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie","David");
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String input = scanner.nextLine();

        Optional<String> foundName = findName(names,input);
        foundName.ifPresentOrElse(
            name ->System.out.println("입력한 이름이 목록에 있어요 " + name),
            ()->System.out.println("입력한 이름이 목록에 없어요 "));
    }

    private static Optional<String> findName(List<String> names, String input) {
        return names.stream()
            .filter(name -> name.equalsIgnoreCase(input))
            .findFirst();
    }
    
}

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void createFile(String filePath, String fileName, StringBuilder message) {
        File file = new File(filePath, fileName);
        String msg;
        try {
            if (file.createNewFile()) {
                msg = "Создан файл: " + file.getName();
            } else {
                msg = "Не удалось создать файл: " + file.getName();
            }
            message.append(msg + "\n");
            System.out.println(msg);
        } catch (IOException e) {
            System.out.println("Указанный путь не существует");
        }
    }
}
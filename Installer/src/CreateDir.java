import java.io.File;

public class CreateDir {
    public static void createDir(String filePath, String directoryName, StringBuilder message) {
        File directory = new File(filePath, directoryName);
        String msg;
        if (directory.mkdir()) {
            msg = "Созданна директория: " + directory.getName();
        } else {
            msg = "Не удалось создать директорию: " + directory.getName();
        }
        message.append(msg + "\n");
        System.out.println(msg);
    }

}

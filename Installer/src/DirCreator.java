import java.io.File;

public class DirCreator {
    public static void createDir(String directoryName, StringBuilder message) {
        File file = new File(directoryName);
        String msg;
        if (file.mkdir()) {
            msg = "Созданна директория: " + file.getName();
        } else {
            msg = "Не удалось создать директорию: " + file.getName();
        }
        message.append(msg + "\n");
        System.out.println(msg);
    }

}

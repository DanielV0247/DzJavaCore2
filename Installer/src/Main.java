import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "C://Games";
        StringBuilder message = new StringBuilder();
        CreateDir.createDir(filePath, "src", message);
        CreateDir.createDir(filePath, "res", message);
        CreateDir.createDir(filePath, "savegames", message);
        CreateDir.createDir(filePath, "temp", message);
        CreateDir.createDir(filePath + "/src", "main", message);
        CreateDir.createDir(filePath + "/src", "test", message);
        CreateFile.createFile(filePath + "/src/main", "Main.java", message);
        CreateFile.createFile(filePath + "/src/main", "Utils.java", message);
        CreateDir.createDir(filePath + "/res", "drawables", message);
        CreateDir.createDir(filePath + "/res", "vectors", message);
        CreateDir.createDir(filePath + "/res", "icons", message);
        CreateFile.createFile(filePath + "/temp", "temp.txt", message);

        try (FileOutputStream fou = new FileOutputStream(filePath + "/temp/temp.txt")) {
            byte[] bytes = message.toString().getBytes();
            fou.write(bytes, 0, bytes.length);
        } catch (IOException io) {
            System.out.println("Ошибка в записи в 'temp.txt'");
        }
    }
}
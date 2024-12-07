import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<GameProgress> saves = new ArrayList<>();

        GameProgress save0 = new GameProgress(10, 0, 1, 15.7);
        saves.add(save0);
        GameProgress save1 = new GameProgress(15, 1, 2, 54.3);
        saves.add(save1);
        GameProgress save2 = new GameProgress(130, 8, 16, 1354.5);
        saves.add(save2);

        File dir = new File("C://Games/savegame");
        if (dir.isDirectory()) {
            for (int i = 0; i < saves.size(); i++) {
                try (FileOutputStream fos = new FileOutputStream("C://Games/savegame/save" + i + ".dat");
                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(saves.get(i));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } else {
            System.out.println("Запустите 'Installer'");
        }

        if (dir.list().length != 0) {

            try {
                ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C://Games/savedgames.zip"));
                for (int i = 0; i < dir.list().length; i++) {
                    FileInputStream fis = new FileInputStream("C://Games/savegame/save" + i + ".dat");
                    ZipEntry entry = new ZipEntry("save" + i + ".dat");
                    zout.putNextEntry(entry);
                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer);
                    zout.write(buffer);
                    zout.closeEntry();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

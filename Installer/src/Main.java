import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();
        ArrayList<String> pathToMain = new ArrayList<>();
        String root = "C://Games";
        pathToMain.add(root);
        pathToMain.add("/src");
        pathToMain.add("/main");
        String filePath = "";
        for (String name : pathToMain) {
            filePath = filePath + name;
            DirCreator.createDir(filePath, message);
        }
        ArrayList<String> filesInMain = new ArrayList<>();
        filesInMain.add("Main.java");
        filesInMain.add("Utils.java");

        for (String name : filesInMain) {
            FileCreator.createFile(filePath, name, message);
        }

        filePath = "";
        ArrayList<String> pathToTest = new ArrayList<>();
        pathToTest.add(root);
        pathToTest.add("/src");
        pathToTest.add("/test");
        for (String name : pathToTest) {
            filePath = filePath + name;
            DirCreator.createDir(filePath, message);
        }
        filePath = "";
        ArrayList<String> pathToSavegames = new ArrayList<>();
        pathToSavegames.add(root);
        pathToSavegames.add("/savegames");
        for (String name : pathToSavegames) {
            filePath = filePath + name;
            DirCreator.createDir(filePath, message);
            System.out.println(name);
        }

        filePath = "";
        ArrayList<String> pathToRes = new ArrayList<>();
        pathToRes.add(root);
        pathToRes.add("/res");
        for (String name : pathToRes) {
            filePath = filePath + name;
            DirCreator.createDir(filePath, message);
        }

        ArrayList<String> foldersInRes = new ArrayList<>();
        foldersInRes.add("/drawables");
        foldersInRes.add("/icons");
        foldersInRes.add("/vectors");
        for (String name : foldersInRes) {
            DirCreator.createDir(filePath + name, message);
        }

        filePath = "";
        ArrayList<String> pathToTemp = new ArrayList<>();
        pathToTemp.add(root);
        pathToTemp.add("/temp");
        for (String name : pathToTemp) {
            filePath = filePath + name;
            DirCreator.createDir(filePath, message);
        }
        FileCreator.createFile(filePath, "temp.txt", message);

        TempWriter.writeTemp(message);
//        String root = "C://Games";
//        DirCreator.createDir(root, "src", message);
//        DirCreator.createDir(root, "res", message);
//        DirCreator.createDir(root, "savegames", message);
//        DirCreator.createDir(root, "temp", message);
//        DirCreator.createDir(root + "/src", "main", message);
//        DirCreator.createDir(root + "/src", "test", message);
//        FileCreator.createFile(root + "/src/main", "Main.java", message);
//        FileCreator.createFile(root + "/src/main", "Utils.java", message);
//        DirCreator.createDir(root + "/res", "drawables", message);
//        DirCreator.createDir(root + "/res", "vectors", message);
//        DirCreator.createDir(root + "/res", "icons", message);
//        FileCreator.createFile(root + "/temp", "temp.txt", message);
//        -_-
    }
}
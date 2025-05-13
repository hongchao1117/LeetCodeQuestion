package sysDesign;

import java.util.*;

/**
 * 以下是使用Java实现的内存文件系统，参考了LeetCode类似题目的设计思路。该实现支持创建目录、添加文件内容、读取文件内容以及列出目录内容等操作。
 * <p>
 * 方法思路
 * 数据结构设计：
 * <p>
 * 使用树状结构表示文件和目录，每个节点可以是文件或目录。
 * <p>
 * 目录节点使用Map存储子节点，文件节点存储内容字符串。
 * <p>
 * 路径处理：
 * <p>
 * 将路径分割为组成部分，例如路径 /a/b/c 分割为 ["a", "b", "c"]。
 * <p>
 * 方法实现：
 * <p>
 * ls(String path)：列出目录内容或返回文件名。如果是目录，返回排序后的子节点名称；如果是文件，返回文件名。
 * <p>
 * mkdir(String path)：逐层创建目录，确保中间目录存在。
 * <p>
 * addContentToFile(String filePath, String content)：创建文件并追加内容，确保父目录存在。
 * <p>
 * readContentFromFile(String filePath)：读取文件内容。
 */
class FileNode {
    boolean isFile;
    StringBuilder content;
    Map<String, FileNode> children;

    public FileNode() {
        this.isFile = false;
        this.content = new StringBuilder();
        this.children = new HashMap<>();
    }
}

public class FileSystem {
    private FileNode root;

    public FileSystem() {
        this.root = new FileNode();
    }

    private List<String> splitPath(String path) {
        List<String> parts = new ArrayList<>();
        if (path.equals("/")) {
            return parts;
        }
        String[] tokens = path.split("/");
        for (String token : tokens) {
            if (!token.isEmpty()) {
                parts.add(token);
            }
        }
        return parts;
    }

    private FileNode getDirectoryNode(List<String> parts) {
        FileNode node = root;
        for (String part : parts) {
            if (!node.children.containsKey(part)) {
                FileNode newNode = new FileNode();
                node.children.put(part, newNode);
            }
            node = node.children.get(part);
            if (node.isFile) {
                // 根据题意假设路径不会错误指向文件节点
            }
        }
        return node;
    }

    public List<String> ls(String path) {
        List<String> parts = splitPath(path);
        FileNode node = root;
        for (String part : parts) {
            if (!node.children.containsKey(part)) {
                return new ArrayList<>();
            }
            node = node.children.get(part);
        }
        if (node.isFile) {
            return parts.isEmpty() ? new ArrayList<>() : Arrays.asList(parts.get(parts.size() - 1));
        } else {
            List<String> result = new ArrayList<>(node.children.keySet());
            Collections.sort(result);
            return result;
        }
    }

    public void mkdir(String path) {
        List<String> parts = splitPath(path);
        getDirectoryNode(parts);
    }

    public void addContentToFile(String filePath, String content) {
        List<String> parts = splitPath(filePath);
        if (parts.isEmpty()) {
            return;
        }
        List<String> dirParts = parts.subList(0, parts.size() - 1);
        String fileName = parts.get(parts.size() - 1);
        FileNode dirNode = getDirectoryNode(dirParts);
        if (!dirNode.children.containsKey(fileName)) {
            FileNode fileNode = new FileNode();
            fileNode.isFile = true;
            fileNode.content.append(content);
            dirNode.children.put(fileName, fileNode);
        } else {
            FileNode fileNode = dirNode.children.get(fileName);
            if (fileNode.isFile) {
                fileNode.content.append(content);
            }
            // else，假设不会出现目录与文件同名的情况
        }
    }

    public String readContentFromFile(String filePath) {
        List<String> parts = splitPath(filePath);
        FileNode node = root;
        for (String part : parts) {
            if (!node.children.containsKey(part)) {
                return "";
            }
            node = node.children.get(part);
        }
        return node.isFile ? node.content.toString() : "";
    }
}
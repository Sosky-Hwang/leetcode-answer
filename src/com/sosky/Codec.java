package com.sosky;

public class Codec {
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        StringBuffer result = new StringBuffer();
        result.append("[");
        result.append(root.val);
        result.append(",");
        if (root.left != null) {
            if (root.left.left != null || root.left.right != null) {
                result.append(serialize(root.left));
            } else {
                result.append(root.left.val);
            }
        } else {
            result.append("null");
        }
        result.append(",");
        if (root.right != null) {
            if (root.right.left != null || root.right.right != null) {
                result.append(serialize(root.right));
            } else {
                result.append(root.right.val);
            }
        } else {
            result.append("null");
        }
        result.append("]");
//        System.out.println(result.toString());
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if (data == null || !data.matches("^\\[.*\\]$")) {
            return null;
        }
        int rootIdx = data.indexOf(",");
        int leftIdx = data.lastIndexOf(",");
        String rootVal = data.substring(0, rootIdx).replaceAll("\\[", "");
        TreeNode root = new TreeNode(Integer.parseInt(rootVal));
        String leftVal = data.substring(rootIdx + 1, leftIdx);
        if (leftVal.matches("^\\[.*\\]$")) {
            root.left = deserialize(leftVal);
        } else {
            if ("null".equals(leftVal)) {
                root.left = null;
            } else {
                try {
                    root.left = new TreeNode(Integer.parseInt(leftVal));
                } catch (Exception e) {
                    System.out.println(leftVal);
                    System.exit(0);
                }
            }
        }
        String rightVal = data.substring(leftIdx + 1).replaceAll("\\]", "");
        if (rightVal.matches("^\\[.*\\]$")) {
            root.right = deserialize(rightVal);
        } else {
            if ("null".equals(rightVal)) {
                root.right = null;
            } else {
                try {
                    root.right = new TreeNode(Integer.parseInt(rightVal));
                } catch (Exception e) {
                    System.out.println(rightVal);
                    System.exit(0);
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.right = new TreeNode(3);
        String serialize = Codec.serialize(root);
        System.out.println(serialize);
        TreeNode treeNode = Codec.deserialize(serialize);
        TreeNode treeNode2 = Codec.deserialize("[41,[37,[24,[1,0,[2,null,[4,3,[9,[7,[6,5,null],8],[11,10,[16,[15,[12,null,[13,null,14]],null],[19,[18,17,null],[20,null,[22,21,23]]]]]]]]],[35,[30,[29,[26,25,[27,null,28]],null],[32,31,[34,33,null]]],36]],[39,38,40]],[44,[42,null,43],[48,[46,45,47],49]]]");
        System.out.println();
    }
}

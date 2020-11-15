class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        traversal(res, root);
        return res;
    }

    private void traversal(List<Integer> res, Node node) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        for (Node child : node.children) {
            traversal(res, child);
        }
    }
}

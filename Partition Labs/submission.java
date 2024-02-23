public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        dfs(S, list);
        return list;
    }
	private void dfs(String s, List<Integer> list) {
        if (s.length() == 0)
            return;
        char first = s.charAt(0);
       int last = s.lastIndexOf(first);
        for (int i = 0; i < last; i++) {
            if (s.lastIndexOf(s.charAt(i)) <= last)
                continue;
            last = s.lastIndexOf(s.charAt(i));
        }
        s = s.substring(last + 1);
        list.add(last + 1);
        dfs(s, list);
    }

/**
 * replace 할 때 data = data.replaceAll(a,""); 이렇게 하지 않으면 replace 되지 않았다.
 * 값 변경 전 데이터를 수정 시 기존 값을 가지고 있는 데이터가 필요하다....
 */

public class skillTree {
    public static void main(String[] args) {
        String skill = "CBD";
        String skill_trees[] = {"BACDE", "CBADF", "AECB", "BDA"};
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            String data = skill_trees[i];
            String skill_clone = new String(data);
            String result = "";
            for(int j = 0; j < skill_clone.length(); j++) {
                if(!skill.contains(String.valueOf(skill_clone.charAt(j)))){
                    data = data.replace(String.valueOf(skill_clone.charAt(j)),"");
                }
            }
            //System.out.println(data);
            System.out.println(data);
            if(skill.indexOf(data) == 0) answer++;
        }
        System.out.println("answer:"+answer);
        //System.out.println(solution(skill,skill_trees));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int index = 0;

        while(true) {
            String skill_tree = skill_trees[index];
            String skill_clone = new String(skill_tree);
            int size = skill_tree.length();
            for (int i =0; i < size; i++) {
                String oneSkill = String.valueOf(skill_clone.charAt(i));
                if (!skill.contains(oneSkill)) {
                    skill_tree = skill_tree.replace(oneSkill, "");
                }
            }
            if (skill.indexOf(skill_tree) == 0) {
                answer++;
            }
            index++;
            if(index == skill_trees.length) break;
        }

        return answer;
    }

    //best
    /*public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }*/
}

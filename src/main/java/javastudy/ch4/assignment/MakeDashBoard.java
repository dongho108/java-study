package javastudy.ch4.assignment;

import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;

public class MakeDashBoard {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/application.properties";
        GitHub gitHub = GitHubBuilder.fromPropertyFile(path).build();

//        GHRepository repository = gitHub.getRepository("dongho108/github-api-test");
        GHRepository repository = gitHub.getRepository("whiteship/live-study");

        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);
        HashMap<String, HashSet<Integer>> dashboard = new HashMap<String, HashSet<Integer>>();
//        HashMap<String, ArrayList<Integer>> dashboard = new HashMap<String, ArrayList<Integer>>();

        inputUserData(issues, dashboard);

        // data가 제대로 들어갔는지 확인용
//        checkData(dashboard);

        String table = makeTableFrame(issues, dashboard);
        table = makeTable(issues, dashboard, table);

        System.out.println(table);

    }

    private static String makeTable(List<GHIssue> issues, HashMap<String, HashSet<Integer>> dashboard, String table) {
        for (String userName : dashboard.keySet()) {
            table += "|" + userName + "|";
            HashSet<Integer> weeks = dashboard.get(userName);
            double rate = (weeks.size() / (double) issues.size()) * 100;

            for (int i = issues.size() - 1; i >= 0; i--) {
                if (weeks.remove(i)) {
                    table += ":white_check_mark:|";
                } else {
                    table += "|";
                }
            }
            table += String.format("%.2f%%|\n", rate);
        }
        return table;
    }

    private static void inputUserData(List<GHIssue> issues, HashMap<String, HashSet<Integer>> dashboard) throws IOException {
        for (int i = 0; i< issues.size(); i++) {

            System.out.println(i + "...");
            GHIssue issue = issues.get(i);
            List<GHIssueComment> comments = issue.getComments();
            for (GHIssueComment comment : comments) {
                String userName = comment.getUser().getName();
                if (dashboard.containsKey(userName)) {
                    dashboard.get(userName).add(i);
                } else {
                    if (userName != null) {
                        dashboard.put(userName, new HashSet<>(Arrays.asList(i)));
//                    dashboard.put(userName, new ArrayList<>(Arrays.asList(i)));
                    }
                }
            }
        }
    }

    private static void checkData(HashMap<String, HashSet<Integer>> dashboard) {
        for (String key : dashboard.keySet()) {
            HashSet<Integer> values = dashboard.get(key);
//            ArrayList<Integer> values = dashboard.get(key);
            System.out.println(key);
            String join = StringUtils.join(values, ", ");
            System.out.println(join);
        }
    }

    private static String makeTableFrame(List<GHIssue> issues, HashMap<String, HashSet<Integer>> dashboard) {
        String table = "|참여자 (" + dashboard.size() + ")|";
        for (int i = 1; i < issues.size() + 1; i++) {
            table += (i + "주차|");
        }
        table += "참여율|\n|";

        for (int i = 0; i < issues.size() + 2; i++) {
            table += "---|";
        }
        table += "\n";
        return table;
    }
}
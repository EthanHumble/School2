package Homework;

public class VotingMachine {
    private int numberYesVotes;
    private int numberNoVotes;
    private String issue;
    public VotingMachine(int Yes, int No, String topics){
        numberYesVotes = Yes;
        numberNoVotes = No;
        issue = topics;
        toString();
    }

    public void voteYes() {
        numberYesVotes += 1;
    }
    public void voteNo() {
        numberNoVotes += 1;
    }

    public int returnYesCount() {
        return numberYesVotes;
    }
    public int returnNoCount() {
        return numberNoVotes;
    }

    public void clearMachine() {
        numberNoVotes = 0;
        numberYesVotes = 0;
    }
    public String toString(){
        return "Yes count is: " + numberYesVotes + " ,and the no count is: " + numberNoVotes;
    }

}



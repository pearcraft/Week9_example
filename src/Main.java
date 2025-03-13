public class Main {
    public static void main(String[] args) {

        int[][] votesTable =
                { {12, 13, 14, 10, 15, 16}, // candidate 0
                        { 5,  2,  6,  8,  4,  3}, // candidate 1
                        {13, 15, 10, 12, 11, 17}, // candidate 2
                };
//        for(int row = 0; row < votesTable.length; row++) {
//            int voteCount = 0;
//            for(int column = 0; column < votesTable[row].length; column++) {
//                voteCount += votesTable[row][column];
//            }
//            System.out.println("Candidate " + row + ": "
//                    + voteCount + " votes.");
        int voteCount = 0;
        System.out.println("Votes Table Length: " + votesTable.length);
        for (int row[] : votesTable) { // each row (canidate)
            voteCount = 0;
            for (int vote: row) {
                voteCount += vote;
            }
            System.out.println("Votes: " + voteCount);
        }

       // Output:
       // Candidate 0: 80 votes.
       //         Candidate 1: 28 votes.
       //         Candidate 2: 78 votes.

    }
}
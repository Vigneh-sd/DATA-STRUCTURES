class Candy {
    public int soln(int[] ratings) {
        int n = ratings.length;
        int i = 1;
        int totalCandies = 1;
        int up = 0, down = 0, peak = 0;

        while (i < n) {
            if (ratings[i] > ratings[i - 1]) {
                up++;
                peak = up;
                down = 0;
                totalCandies += 1 + up;
            } else if (ratings[i] == ratings[i - 1]) {
                up = down = peak = 0;
                totalCandies += 1;
            } else {
                up = 0;
                down++;
                totalCandies += 1 + down - (peak >= down ? 1 : 0); 
            }
            i++;
        }

        return totalCandies;
    }
}

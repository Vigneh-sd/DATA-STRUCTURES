
class SubstrAllThreeChar {
    public int solution(String s) {
        int r=0, max=0, min=Integer.MAX_VALUE;
        int cnta=-1, cntb=-1, cntc=-1;
        
        while(r<s.length())
        {
            char ch = s.charAt(r);
            if(ch=='a') cnta=r;
            else if(ch=='b') cntb=r;
            else cntc=r;

            if(cnta!=-1 && cntb!=-1 && cntc!=-1)
            {
                min=Math.min(cnta, Math.min(cntb,cntc));
                max+=min+1;
            }
            r++;
        }
        return max;
    }
}
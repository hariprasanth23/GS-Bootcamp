package gs;

public class LaserBeamsInABank {
    public int numberOfBeams(String[] bank) {

        int previousLaserCount=0,totalLaserBeam=0;
        for(String eachFloor: bank){
            int count =0;
            char[] ch = eachFloor.toCharArray();
            for(char ch1:ch){
                if(ch1=='1'){
                    count++;
                }
            }
            if(count>0){
                totalLaserBeam = totalLaserBeam + ( previousLaserCount * count );
                previousLaserCount = count;
            }
        }

        return totalLaserBeam;
    }

    public static void main(String[] args){
        System.out.println(new LaserBeamsInABank().numberOfBeams(new String[]{"011001","000000","010100","001000"}));
    }
}

/**
 *
 * @author xekid78
 *
 */
public class sample19 {

	public static void main(String[] args) {
		String[][] areaMap = new String[20][20];
        areaMap[0][0] = "城";
        areaMap[5][17] = "町";
        areaMap[19][19] = "町";
        for (int i = 0; i < areaMap.length; i++) {
            for (int j = 0; j < areaMap[i].length; j++) {
                if (areaMap[i][j] == null) {
                	if (i % 2 == 0 || j % 3 == 0) {
                		areaMap[i][j] = "  ";
                	} else {
                		areaMap[i][j] = "森";
                	}
                }
                System.out.print(areaMap[i][j]);
            }
            System.out.println("");
        }

	}

}

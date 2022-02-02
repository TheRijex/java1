public class Dz {
    public static void main(String[] args) {
        int[] nums = new int[1000];
        int[] reverNum = new int[nums.length];
        String[] month = {"Январь",
                          "Февраль",
                          "Март",
                          "Апрель",
                          "Май",
                          "Июнь",
                          "Июль",
                          "Август",
                          "Сентябрь",
                          "Октябрь",
                          "Ноябрь",
                          "Декабрь"};
        String totalMoth = "Год состоит из 12 месяцев, а вот и они -";

        for (int i = 0; i<1000; i++){
            nums[i] = i;
        }

        for (int i = 0, j = 999; i < 1000; i++, j--){
            reverNum[i] = nums[j];
        }
        for(int i : reverNum){
            //System.out.println(reverNum[i]);
        }

        for ( int i = 0; i < month.length; i++){
            if (i!=11){
                totalMoth +=" " + month[i] + ",";
            }else {
                totalMoth =" " + totalMoth +month[i] + ".";
            }
        }
        System.out.println(totalMoth);
    }
}

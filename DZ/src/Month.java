public class Month {
    public static void main(String[] args) {
        String EnterMn = "Январь";

        if(EnterMn == "Декабрь" || EnterMn == "Январь" || EnterMn == "Февраль"){
            System.out.print("Сейчас на улице Зима");

        }
         else if(EnterMn == "Март" || EnterMn == "Апрель" || EnterMn == "Май"){
            System.out.print("Сейчас на улице Весна");
        }
         else if(EnterMn == "Июнь" || EnterMn == "Июль" || EnterMn == "Август"){
            System.out.print("Сейчас на улице Лето");
        }
        else if(EnterMn == "Сентябрь" || EnterMn == "Октябрь" || EnterMn == "Ноябрь"){
            System.out.print("Сейчас на улице Осень");
        }
        else {
            System.out.print("Ты втираешь мне какуе-то дичь");
        }


    }
}

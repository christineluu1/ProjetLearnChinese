package com.example.projetlearnchinese;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetlearnchinese.R;

import java.util.ArrayList;

public class Cours extends AppCompatActivity {

    private final ArrayList<String> listOfCours = new ArrayList<>();

    @Override
    @SuppressWarnings("unchecked")
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apprendre);

        ListView listViewCours = findViewById(R.id.listViewCours);

        listOfCours.add("1. 大\tdà:\tgrand");
        listOfCours.add("2. 小\txiǎo:\tpetit");
        listOfCours.add("3. 高兴\tgāoxìng:\tcontent");
        listOfCours.add("4. 米饭\tmǐfàn:\ttriz");
        listOfCours.add("5. 苹果\tpíngguǒ:\tpomme");
        listOfCours.add("6. 水果\tshuǐguǒ:\tfruit");
        listOfCours.add("7. 狗\tgǒu:\tchien");
        listOfCours.add("8. 貓\tmāo:\tchat");
        listOfCours.add("9. 饭馆\tfànguǎn:\trestaurant");
        listOfCours.add("10. 火车站\thuǒchēzhàn:\tgare ferroviaire");
        listOfCours.add("11. 家\tjiā:\tmaison, famille");
        listOfCours.add("12. 学校\txuéxiào:\técole");
        listOfCours.add("13. 医院\tyīyuàn:\thôpital");
        listOfCours.add("14. 电脑\tdiànnǎo:\tordinateur");
        listOfCours.add("15. 飞机\tfēijī:\tavion");
        listOfCours.add("16. 钱\tqián:\targent");
        listOfCours.add("17. 书\tshū:\tlivre");
        listOfCours.add("18. 桌子\tzhuōzi:\ttable");
        listOfCours.add("19. 爸爸\tbàba:\tpapa");
        listOfCours.add("20. 老師\tlǎoshī:\tenseignant");
        listOfCours.add("21. 媽媽\tmāma:\ttmaman");
        listOfCours.add("22. 不客气\tbù kèqi:\tje vous en prie");
        listOfCours.add("23. 对不起\tduìbuqǐ:\tdésolé, pardon");
        listOfCours.add("24. 没关系\tméi guānxi:\tpeu importe, ce n’est pas grave");
        listOfCours.add("25. 谢谢\txièxie:\tmerci");
        listOfCours.add("26. 再見\tzàijiàn:\tau revoir");
        listOfCours.add("27. 睡觉\tshuìjiào:\tdormir");
        listOfCours.add("28. 下雨\txiàyǔ:\tpleuvoir");
        listOfCours.add("29. 说话\tshuōhuà:\tparler, dire");
        listOfCours.add("30. 学习\txuéxí:\tétudier, apprendre");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listOfCours);

        listViewCours.setAdapter(adapter);
    }
}

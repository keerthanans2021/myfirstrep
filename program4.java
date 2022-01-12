public class MainActivity extends AppCompatActivity {
    int ch=1;
    float font=40;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t=findViewById(R.id.tv);
        Button b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTextSize(font);
                font=font+5;
                if(font==50) font=30;
            }
        });
        Button b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (ch){
                case 1:
                    t.setTextColor(Color.BLUE);
                    break;
                case 2:
                    t.setTextColor(Color.RED);
                    break;
                case 3:
                    t.setTextColor(Color.GREEN);
                    break;
                case 4:
                    t.setTextColor(Color.YELLOW);
                    break;
                case 5:
                    t.setTextColor(Color.BLACK);
                    break;
            }
            ch++;
                if(ch==6) ch=1;
            }
        });
    }
}
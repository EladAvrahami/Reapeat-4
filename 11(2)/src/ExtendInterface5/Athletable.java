package ExtendInterface5;
//ממשקים ניתן להרחיב באמצעות הורשה (extend) כמה שרוצים
//ממשק יכלול את כל השיטות שבממשק שאותו הרחיב +השיטות הנוספות
public interface Athletable extends betterSwimmable1,Rideable  {
    void breath();
}

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    // Конструктор для инициализации полей
    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    // Аннотация для параметров
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {17, false}, // Меньше 18, ожидается false
                {18, true},  // Ровно 18, ожидается true
                {19, true},  // Больше 18, ожидается true
                {20, true},  // Больше 18, ожидается true
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();

        // Передаем возраст пользователя
        boolean isAdult = program.checkIsAdult(age);

        // Сравниваем полученный и ожидаемый результаты
        assertEquals("Метод checkIsAdult должен вернуть " + result + " для возраста " + age + ".", result, isAdult);
    }
}
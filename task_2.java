@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
        }

@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);

        // Проверяем, что метод возвращает false
        assertEquals("Метод checkIsAdult должен вернуть false для возраста 17 лет.", false, isAdult);
        }

@Test
public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);

        // Проверяем, что метод возвращает true
        assertEquals("Метод checkIsAdult должен вернуть true для возраста 18 лет.", true, isAdult);
        }

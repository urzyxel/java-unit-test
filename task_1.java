@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Метод checkIsAdult должен вернуть true для возраста 19 лет.", true, isAdult);
        }
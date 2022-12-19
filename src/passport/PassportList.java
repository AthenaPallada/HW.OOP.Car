package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PassportList {

    public static void main(String[] args) {
        Set<Passport> passports1 = new HashSet<>();
        passports1.add(new Passport("4567", "Алиса", "Егорова", "Александровна", LocalDate.now().minusYears(23)));
        passports1.add(new Passport("1256", "Малиса", "Снегирева", "Николаевна", LocalDate.now().minusYears(18)));
        passports1.add(new Passport("4997", "Джиневра", "Пендрагон", "Никитовна", LocalDate.now().minusYears(27)));
        PassportList passportList = new PassportList(passports1);
        System.out.println(passportList);
        passportList.add(new Passport("4567", "Алиса", "Егорова", "Александровна", LocalDate.now().minusYears(22)));
        System.out.println(passportList);
    }
    private Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public void add(Passport passport) {
        Passport old = get(passport.getNumber());
        if(old != null) {
            passports.remove(old);

        }
        passports.add(passport);
    }

    public Passport get(String number) {
        for(Passport passport : passports) {
            if(passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return passports.toString();
    }
}

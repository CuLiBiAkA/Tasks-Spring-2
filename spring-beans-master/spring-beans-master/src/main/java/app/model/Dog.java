package app.model;

import org.springframework.stereotype.Component;

@Component("dogHuev")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a PSINA";
    }
}


package org.example;

public class BuilderTest {
    int id;
    String name;
    private BuilderTest(builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }
    public static class builder {
        int id;
        String name;

        public builder setId(int id)  {
            this.id = id;
            return this;
        }

        public builder setName(String name)  {
            this.name = name;
            return this;
        }
        public BuilderTest build() {
            return new BuilderTest(this);
        }
    }
}

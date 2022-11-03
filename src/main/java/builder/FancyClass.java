package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FancyClass {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public static FancyBuilderA fancyBuilder() {
        return new FancyBuilderA();
    }

    public static class FancyBuilderA {
        public FancyBuilderA() {
        }

        public FancyBuilderE a(String a) {
            return new FancyBuilderE(a);
        }
    }

    public static class FancyBuilderE {
        private String a;

        public FancyBuilderE(String a) {
            this.a = a;
        }

        public FancyBuilderH e(String e) {
            return new FancyBuilderH(a, e);
        }
    }

    public static class FancyBuilderH {
        private String a;
        private String e;

        public FancyBuilderH(String a, String e) {
            this.a = a;
            this.e = e;
        }

        public FancyBuilder h(String h) {
            return new FancyBuilder(a, e, h);
        }
    }

    public static class FancyBuilder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;

        FancyBuilder(String a, String e, String h) {
            this.a = a;
            this.e = e;
            this.h = h;
        }

        public FancyBuilder b(String b) {
            this.b = b;
            return this;
        }

        public FancyBuilder c(String c) {
            this.c = c;
            return this;
        }

        public FancyBuilder d(String d) {
            this.d = d;
            return this;
        }

        public FancyBuilder f(String f) {
            this.f = f;
            return this;
        }

        public FancyBuilder g(String g) {
            this.g = g;
            return this;
        }

        public FancyBuilder i(String i) {
            this.i = i;
            return this;
        }

        public FancyBuilder j(String j) {
            this.j = j;
            return this;
        }

        public FancyClass build() {
            return new FancyClass(a, b, c, d, e, f, g, h, i, j);
        }
    }
}

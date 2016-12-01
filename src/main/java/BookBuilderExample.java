/**
 * Created by eishkinina on 14.11.16.
 */
public class BookBuilderExample {}

    class BooksBody {

        private final String bookName;
        private final String autor;
        // optional fields
        private int year;
        private String publisher;


        private BooksBody(BookBuilder b) {
            this.bookName = b.bookName;
            this.autor = b.autor;
            this.year = b.year;
            this.publisher = b.publisher;

        }

        static BookBuilder newBookBuilder(String bookName, String autor) {
            return new BookBuilder(bookName, autor); // = сетаем поля для билдера
        } // чтобы получить билдер

        static class BookBuilder {
            private String publisher;
            private int year;
            private final String autor;
            private final String bookName;

            public BookBuilder(String bookName, String autor) {
                this.bookName = bookName;
                this.autor = autor; //= сетает поля сверху
             // которые передали
                ]]  }

            public BookBuilder withYear(int year) {
                this.year = year;
                return this;
            }


            public BookBuilder withPublisher(String publisher) {
                this.publisher = publisher;
                return this;
            }


            public BooksBody build() {
                return new BooksBody(this);
            }
        }


    }

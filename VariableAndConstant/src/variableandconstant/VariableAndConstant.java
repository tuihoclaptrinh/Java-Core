/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableandconstant;

/**
 *
 * @author tuan anh
 */
public class VariableAndConstant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variable : Name + DataType + Value
        String name = "tuan anh";
        //        Local variable:
        //
        //– Được khai báo bên trong các method, constructor, hoặc block
        //
        //– Được tạo ra khi method, constructor hoặc block được gọi và biến này sẽ bị destroy ngay khi thực hiện xong method, constructor hoặc block
        //
        //– Các giới hạn truy xuất (access modifier) không được dùng cho các biến loại này
        //
        //– Chúng chỉ xuất hiện nội trong giới hạn của method, constructor hoặc block
        //
        //– Không có giá trị mặc định cho các biến local nên chúng nên được khai báo với một giá trị khởi tạo (initial value)

        //Instance variable:
        //
        //– được khai báo trong class, nhưng bên ngoài các method, constructor hoặc block.
        //
        //– được tạo ra khi một object được tạo ra và bị hủy khi object bị hủy
        //
        //– giữ các giá trị được tham chiếu tới bởi nhiều method, constructor hoặc block, hoặc là các phần khác.
        //
        //– có thể được khai báo trong lớp trước hoặc sau khi sử dụng nó.
        //
        //– các giới hạn truy xuất được dùng với local variable.
        //
        //– thông thường thì local variable sẽ visible với tất cả các method, constructor và block trong class.
        //
        //– có giá trị mặc định của chúng. number thì là 0, boolean thì là false, object là null.
        //
        //– có thể được truy xuất trực tiếp bằng các gọi tên biến bên trong class. Còn với những static method hoặc lớp khác (khi instance variable được cho phép truy
        //
        //xuất) , thì chúng có thể được gọi thông qua ObjectReference.VariableName

        //Class hoặc static variable:
        //
        //– được khai báo với từ khóa static trong class nhưng bên ngoài method, constructor hoặc block
        //
        //– biến static là duy nhất bên trong một class.
        //
        //– biến này được dùng ít hơn là khai báo biến hằng.
        //
        //– được lưu trữ trong bộ nhớ static.
        //
        //-được tạo ra khi chương trình bắt đầu chạy và hủy khi chương trình dừng.
        //
        //-visible thì tương tự như instance varibale. Hầu hết các static variable được khai báo public.
        //
        //-giá trị mặc định cũng tương tự như instance variable.
        //
        //-có thể được truy xuất bằng cách gọi tên lớp: ClassName.VariableName

//            public static final String CHUOI = "Hello tuihoclaptrinh!";

//Trong phần này chúng ta sẽ tìm hiểu về hằng số trong Java và cách khai báo hằng số để sử dụng trong khi viết chương trình.
//
//Vậy theo các bạn hằng số là gì? Chúng ta có thể hình dung như sau: Trong đời sống hằng ngày, có những giá trị không bao giờ thay đổi chẳng hạn như: Một ngày có 24 giờ, một năm có 12 tháng và trong toán học giá trị không thay đổi này được thể hiện thông quá số PI, số Fibonacci,... Trong Java cũng vậy, hằng số là những giá trị không bao giờ thay đổi trong suốt quá trình sử dụng, là một giá trị bất biến trong chương trình.
//
//Về quy tắc đặt tên hằng tôi đã đề cập trong bài Cú pháp và quy tắc Java cơ bản. Trong phần này, tôi sẽ không nhắc lại vấn đề này mà tôi sẽ trình bày cách khai báo hằng số và đưa ra các ví dụ có sử dụng hằng.
//
//Để khai báo hằng số ta sử dụng từ khóa static final đặt trước tên hằng số: [Phạm vi truy cập] static final [kiểu dữ liệu] [tên hằng số] = [giá trị];
//
//Dưới đây là chương trình minh họa cách sử dụng hằng số.
}

}

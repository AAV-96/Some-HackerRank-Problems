#include <iostream>
#include <sstream>
using namespace std;

/*
Enter code for class Student here.
Read statement for specification.
*/
class Student {
    public:
        int cage, cstandard;
        string cfirst_name, clast_name;
    
        void set_age(int age) {
            cage = age;
        }
    
        int get_age(){
            return cage;
        }
    
        void set_standard(int standard){
            cstandard = standard;
        }
    
        int get_standard(){
            return cstandard;
        }
    
        void set_first_name(string first_name) {
            cfirst_name = first_name;
        }
    
        string get_first_name() {
            return cfirst_name;
        }
    
        void set_last_name(string last_name) {
            clast_name = last_name;
        }
    
        string get_last_name() {
            return clast_name;
        }
        
        string to_string() {
            stringstream ss;
            ss << cage << "," << cfirst_name << "," << clast_name << "," << cstandard;
            return ss.str();
        }
};
int main() {
    int age, standard;
    string first_name, last_name;
    
    cin >> age >> first_name >> last_name >> standard;
    
    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);
    
    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n";
    cout << "\n";
    cout << st.to_string();
    
    return 0;
}

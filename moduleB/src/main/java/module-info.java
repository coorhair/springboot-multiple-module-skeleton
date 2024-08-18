module moduleB {
    requires moduleC;
    requires org.slf4j;
    requires static org.apache.logging.log4j;
    requires static lombok;

    exports vn.com.rega.moduleb;
}
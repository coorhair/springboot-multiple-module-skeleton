module moduleC {
    requires static lombok;
    requires org.apache.commons.lang3;

    opens vn.com.rega.modulec; // allow deep reflection
    exports vn.com.rega.modulec;
}
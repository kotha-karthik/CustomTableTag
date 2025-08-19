package com.iss.tags;

import java.util.List;

import com.iss.IModel.IAttribute;
import com.iss.IModel.IModel;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class TableCustomTag extends TagSupport {
    private List<IModel> array;

    public List<IModel> getArray() {
        return array;
    }

    // Accepts list of IModel (Student, Employee, etc.)
    public void setArray(List<IModel> array) {
        this.array = array;
    }

    @Override
    public int doStartTag() {
        JspWriter out = pageContext.getOut();
        try {
            if (array != null && !array.isEmpty()) {
                out.write("<table border='1' style='border-collapse: collapse; width: 50%; text-align: center;'>");

                
                IModel first = array.get(0);
                List<IAttribute> firstAttrs = first.getAttributes();

                out.write("<thead><tr style='background-color: #f2f2f2;'>");
                for (IAttribute attr : firstAttrs) {
                    out.write("<th>" + attr.toString() + "</th>");
                }
                out.write("</tr></thead>");

                
                out.write("<tbody>");
                for (IModel model : array) {
                    out.write("<tr>");
                    for (IAttribute attr : model.getAttributes()) {
                        out.write("<td>" + attr.getValue() + "</td>");
                    }
                    out.write("</tr>");
                }
                out.write("</tbody>");
                out.write("</table>");
            } else {
                out.write("<p>No data available.</p>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}

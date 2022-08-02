package it.maxischermiled.poc.getdown;

import com.diffplug.common.swt.Layouts;
import com.diffplug.common.swt.Shells;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Label;

import java.util.logging.Logger;

public class PocGetdownMain {
    private static Logger logger = Logger.getLogger(PocGetdownMain.class.getName());

    public static void main(String[] args) {
        logger.info("That's a poc for getdown");

        int style = SWT.RESIZE | SWT.ICON | SWT.CLOSE | SWT.BORDER;
        Shells.builder(style, cmp -> {
            Layouts.setGrid(cmp)
                    .numColumns(1)
                    .columnsEqualWidth(true)
                    .horizontalSpacing(0)
                    .verticalSpacing(0);
            Label label = new Label(cmp, SWT.NONE);
            label.setText("hello world");
            Layouts.setGridData(label).grabAll();
        }).setTitle("POC Getdown").setSize(300,250).setLocation(new Point(10,10)).openOnDisplayBlocking();
    }

}

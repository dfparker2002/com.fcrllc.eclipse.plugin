package com.fcrllc.eclipse.plugin.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (json).
 */

public class WizardPage1 extends WizardPage {

	private Text txt0;

	private Text txt1;

	private Button btnPrevious;


	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public WizardPage1(ISelection selection) {
		super("wizardPage");
		setTitle("Multi-page Editor File");
		setDescription("This wizard creates a new file with *.json extension that can be opened by a multi-page editor.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Something 0:");
				
		txt0 = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		txt0.setLayoutData(gd);

		label = new Label(container, SWT.NULL);
		label.setText("&Something 1:");

		txt1 = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		txt1.setLayoutData(gd);

		initialize();
		setControl(container);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		btnPrevious = new Button(container, SWT.NONE);
		btnPrevious.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		btnPrevious.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnPrevious.setText("Previous");
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		txt0.setText("something 0");
		txt1.setText("something 1");
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getText0() {
		return txt0.getText();
	}

	public String getText1() {
		return txt1.getText();
	}

	public Button getBtnPrevious() {
		return btnPrevious;
	}

/*
 * TODO delegate this to Wizard manager or commmand manager class
 */
	@Override
	public IWizardPage getPreviousPage() {

//		saveDataToModel();
		System.out.printf("Move to prev page: %s to %s", super.getPreviousPage().getName(), getName() );
		return super.getPreviousPage();
	}

}
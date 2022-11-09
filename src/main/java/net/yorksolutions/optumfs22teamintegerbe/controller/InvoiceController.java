package net.yorksolutions.optumfs22teamintegerbe.controller;

import net.yorksolutions.optumfs22teamintegerbe.entity.Cart;
import net.yorksolutions.optumfs22teamintegerbe.entity.Invoice;

import net.yorksolutions.optumfs22teamintegerbe.entity.Product;
import net.yorksolutions.optumfs22teamintegerbe.service.InvoiceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invoices")
@CrossOrigin
public class InvoiceController {
    InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping
    public Invoice createInvoice(@RequestBody Invoice invoice) {
        return this.invoiceService.create(invoice);
    }

    @GetMapping
    public Iterable<Invoice> getAllInvoiceList() {
        return this.invoiceService.getAllInvoices();
    }

    @GetMapping("/{accountId}")
    public Iterable<Invoice> getInvoiceListByAccountId(@PathVariable Long accountId) {
        return this.invoiceService.getInvoicesByAccountId(accountId);
    }

}

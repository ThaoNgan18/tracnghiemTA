/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import static com.btl.tracnghiemta.CauHinh.f;
import static com.btl.tracnghiemta.CauHinh.sc;
import static com.btl.tracnghiemta.CauHinh.quanLyHocVien;
import static com.btl.tracnghiemta.CauHinh.quanLyCauHoi;
import com.btl.tracnghiemta.CauHoi;
import com.btl.tracnghiemta.Conversation;
import com.btl.tracnghiemta.InComplete;
import com.btl.tracnghiemta.MultipleChoice;
import com.btl.tracnghiemta.PhuongAn;
import com.btl.tracnghiemta.QuanLyCauHoi;
import com.btl.tracnghiemta.HocVien;
import com.btl.tracnghiemta.QuanLyHocVien;
import com.btl.tracnghiemta.ThanhTich;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author thao trang
 */
public class Tester {

    public void Controller() throws FileNotFoundException, ParseException {
        QuanLyCauHoi quanLyCauHoi = new QuanLyCauHoi();

//      MULTIPLECHOICE
        MultipleChoice m1 = new MultipleChoice("Adj", "What ... your name?", 0);
        PhuongAn m1c1 = new PhuongAn("are", false);
        PhuongAn m1c2 = new PhuongAn("is", true, "Vi o day can so it.");
        PhuongAn m1c3 = new PhuongAn("it", false);
        PhuongAn m1c4 = new PhuongAn("do", false);
        m1.addChoice(m1c1);
        m1.addChoice(m1c2);
        m1.addChoice(m1c3);
        m1.addChoice(m1c4);

        MultipleChoice m2 = new MultipleChoice("Adj", " ... old are you?", 0);
        PhuongAn m2c1 = new PhuongAn("How", true, "Cau hoi nay dung de hoi tuoi.");
        PhuongAn m2c2 = new PhuongAn("What", false);
        PhuongAn m2c3 = new PhuongAn("Which", false);
        PhuongAn m2c4 = new PhuongAn("Who", false);
        m2.addChoice(m2c1);
        m2.addChoice(m2c2);
        m2.addChoice(m2c3);
        m2.addChoice(m2c4);

        MultipleChoice m3 = new MultipleChoice("Adj", "Where ... you born?", 0);
        PhuongAn m3c1 = new PhuongAn("was", false);
        PhuongAn m3c2 = new PhuongAn("have", false);
        PhuongAn m3c3 = new PhuongAn("are", false);
        PhuongAn m3c4 = new PhuongAn("were", true, "Cau nay hoi ve noi ban sinh ra");
        m3.addChoice(m3c1);
        m3.addChoice(m3c2);
        m3.addChoice(m3c3);
        m3.addChoice(m3c4);

        MultipleChoice m4 = new MultipleChoice("Verb", "A computer ... a tool for finding data.", 0);
        PhuongAn m4c1 = new PhuongAn("was", false);
        PhuongAn m4c2 = new PhuongAn("have", false);
        PhuongAn m4c3 = new PhuongAn("are", false);
        PhuongAn m4c4 = new PhuongAn("is", true, "Vi 'a computer' o day la so it nen chon 'is'");
        m4.addChoice(m4c1);
        m4.addChoice(m4c2);
        m4.addChoice(m4c3);
        m4.addChoice(m4c4);

        MultipleChoice m5 = new MultipleChoice("Verb", "Computers ... helped people a lot in all fields.", 0);
        PhuongAn m5c1 = new PhuongAn("was", false);
        PhuongAn m5c2 = new PhuongAn("have", true, "'Computers' o day la so nhieu nen chon 'have'.");
        PhuongAn m5c3 = new PhuongAn("are", false);
        PhuongAn m5c4 = new PhuongAn("is", false);
        m5.addChoice(m5c1);
        m5.addChoice(m5c2);
        m5.addChoice(m5c3);
        m5.addChoice(m5c4);

        MultipleChoice m6 = new MultipleChoice("Verb", "A LAN ... a network that connects computers.", 0);
        PhuongAn m6c1 = new PhuongAn("was", false);
        PhuongAn m6c2 = new PhuongAn("have", false);
        PhuongAn m6c3 = new PhuongAn("are", false);
        PhuongAn m6c4 = new PhuongAn("is", true, "Danh tu rieng la so it ne dap an la 'is'.");
        m6.addChoice(m6c1);
        m6.addChoice(m6c2);
        m6.addChoice(m6c3);
        m6.addChoice(m6c4);

        quanLyCauHoi.themCauHoi(m1);
        quanLyCauHoi.themCauHoi(m2);
        quanLyCauHoi.themCauHoi(m3);
        quanLyCauHoi.themCauHoi(m4);
        quanLyCauHoi.themCauHoi(m5);
        quanLyCauHoi.themCauHoi(m6);

        //INCOMPLETE
        //Easy
        InComplete i1 = new InComplete("Adj", "What(1) ... your name? (2)... name is Nam", 0);

        MultipleChoice i1m1 = new MultipleChoice("Adv", "Dien vao cho trong thu (1)", 0);
        PhuongAn i1m1c1 = new PhuongAn("is", true);
        PhuongAn i1m1c2 = new PhuongAn("are", false);
        PhuongAn i1m1c3 = new PhuongAn("were", false);
        PhuongAn i1m1c4 = new PhuongAn("was", false);
        i1m1.addChoice(i1m1c1);
        i1m1.addChoice(i1m1c2);
        i1m1.addChoice(i1m1c3);
        i1m1.addChoice(i1m1c4);

        MultipleChoice i1m2 = new MultipleChoice("Adj", "Dien vao cho trong thu (2)", 0);
        PhuongAn i1m2c1 = new PhuongAn("His", false);
        PhuongAn i1m2c2 = new PhuongAn("Her", false);
        PhuongAn i1m2c3 = new PhuongAn("My", true);
        PhuongAn i1m2c4 = new PhuongAn("Your", false);
        i1m2.addChoice(i1m2c1);
        i1m2.addChoice(i1m2c2);
        i1m2.addChoice(i1m2c3);
        i1m2.addChoice(i1m2c4);

        i1.themCauHoi(i1m1);
        i1.themCauHoi(i1m2);

        InComplete i2 = new InComplete("Adj", " (1)... do you live? I live (2)... Viet Nam (info)", 0);

        MultipleChoice i2m1 = new MultipleChoice("Adj", "Dien vao cho trong thu (1)", 0);
        PhuongAn i2m1c1 = new PhuongAn("What", false);
        PhuongAn i2m1c2 = new PhuongAn("Where", true);
        PhuongAn i2m1c3 = new PhuongAn("Who", false);
        PhuongAn i2m1c4 = new PhuongAn("Which", false);
        i2m1.addChoice(i2m1c1);
        i2m1.addChoice(i2m1c2);
        i2m1.addChoice(i2m1c3);
        i2m1.addChoice(i2m1c4);

        MultipleChoice i2m2 = new MultipleChoice("Adj", "Dien vao cho trong thu (2)", 0);
        PhuongAn i2m2c1 = new PhuongAn("in", true);
        PhuongAn i2m2c2 = new PhuongAn("on", false);
        PhuongAn i2m2c3 = new PhuongAn("at", false);
        PhuongAn i2m2c4 = new PhuongAn("it", false);
        i2m2.addChoice(i2m2c1);
        i2m2.addChoice(i2m2c2);
        i2m2.addChoice(i2m2c3);
        i2m2.addChoice(i2m2c4);

        i2.themCauHoi(i2m1);
        i2.themCauHoi(i2m2);

        //Normal
        InComplete i3 = new InComplete("Verb", "My friends (1)... to the zoo but we (2)... yesterday", 1);

        MultipleChoice i3m1 = new MultipleChoice("Verb", "Dien vao cho trong thu (1)", 1);
        PhuongAn i3m1c1 = new PhuongAn("didn't go", false);
        PhuongAn i3m1c2 = new PhuongAn("don't go", true);
        PhuongAn i3m1c3 = new PhuongAn("does go", false);
        PhuongAn i3m1c4 = new PhuongAn("doesn't go", false);
        i3m1.addChoice(i3m1c1);
        i3m1.addChoice(i3m1c2);
        i3m1.addChoice(i3m1c3);
        i3m1.addChoice(i3m1c4);

        MultipleChoice i3m2 = new MultipleChoice("Verb", "Dien vao cho trong thu (2)", 1);
        PhuongAn i3m2c1 = new PhuongAn("were", true);
        PhuongAn i3m2c2 = new PhuongAn("did", false);
        PhuongAn i3m2c3 = new PhuongAn("don't", false);
        PhuongAn i3m2c4 = new PhuongAn("was", false);
        i3m2.addChoice(i3m2c1);
        i3m2.addChoice(i3m2c2);
        i3m2.addChoice(i3m2c3);
        i3m2.addChoice(i3m2c4);

        i3.themCauHoi(i3m1);
        i3.themCauHoi(i3m2);

        InComplete i4 = new InComplete("Verb", "We (1)... not allower (2)... jeans at school", 1);

        MultipleChoice i4m1 = new MultipleChoice("Verb", "Dien vao cho trong thu (1)", 1);
        PhuongAn i4m1c1 = new PhuongAn("is", false);
        PhuongAn i4m1c2 = new PhuongAn("are", true);
        PhuongAn i4m1c3 = new PhuongAn("was", false);
        PhuongAn i4m1c4 = new PhuongAn("were", false);
        i4m1.addChoice(i4m1c1);
        i4m1.addChoice(i4m1c2);
        i4m1.addChoice(i4m1c3);
        i4m1.addChoice(i4m1c4);

        MultipleChoice i4m2 = new MultipleChoice("Verb", "Dien vao cho trong thu (2)", 1);
        PhuongAn i4m2c1 = new PhuongAn("to wear", true);
        PhuongAn i4m2c2 = new PhuongAn("wear", false);
        PhuongAn i4m2c3 = new PhuongAn("wearing", false);
        PhuongAn i4m2c4 = new PhuongAn("worn", false);
        i4m2.addChoice(i4m2c1);
        i4m2.addChoice(i4m2c2);
        i4m2.addChoice(i4m2c3);
        i4m2.addChoice(i4m2c4);

        i4.themCauHoi(i4m1);
        i4.themCauHoi(i4m2);

        //Hard
        InComplete i5 = new InComplete("Verb", "How (1).... since we (2).... school?", 2);

        MultipleChoice i5m1 = new MultipleChoice("Verb", "Dien vao cho trong thu (1)", 2);
        PhuongAn i5m1c1 = new PhuongAn("are you", false);
        PhuongAn i5m1c2 = new PhuongAn("have you", true);
        PhuongAn i5m1c3 = new PhuongAn("have you been", false);
        PhuongAn i5m1c4 = new PhuongAn("were you", false);
        i5m1.addChoice(i5m1c1);
        i5m1.addChoice(i5m1c2);
        i5m1.addChoice(i5m1c3);
        i5m1.addChoice(i5m1c4);

        MultipleChoice i5m2 = new MultipleChoice("Verb", "Dien vao cho trong thu (2)", 2);
        PhuongAn i5m2c1 = new PhuongAn("left", false);
        PhuongAn i5m2c2 = new PhuongAn("have left", true);
        PhuongAn i5m2c3 = new PhuongAn("has left", false);
        PhuongAn i5m2c4 = new PhuongAn("had left", false);
        i5m2.addChoice(i5m2c1);
        i5m2.addChoice(i5m2c2);
        i5m2.addChoice(i5m2c3);
        i5m2.addChoice(i5m2c4);

        i5.themCauHoi(i5m1);
        i5.themCauHoi(i5m2);

        InComplete i6 = new InComplete("Verb", "Since we (1).... in the new house we (2).... very busy.", 2);

        MultipleChoice i6m1 = new MultipleChoice("Verb", "Dien vao cho trong thu (1)", 2);
        PhuongAn i6m1c1 = new PhuongAn("move", false);
        PhuongAn i6m1c2 = new PhuongAn("have moved", true);
        PhuongAn i6m1c3 = new PhuongAn("moved", false);
        PhuongAn i6m1c4 = new PhuongAn("has move", false);
        i6m1.addChoice(i6m1c1);
        i6m1.addChoice(i6m1c2);
        i6m1.addChoice(i6m1c3);
        i6m1.addChoice(i6m1c4);

        MultipleChoice i6m2 = new MultipleChoice("Verb", "Dien vao cho trong thu (2)", 2);
        PhuongAn i6m2c1 = new PhuongAn("is", false);
        PhuongAn i6m2c2 = new PhuongAn("are", true);
        PhuongAn i6m2c3 = new PhuongAn("were", false);
        PhuongAn i6m2c4 = new PhuongAn("have been", false);
        i6m2.addChoice(i6m2c1);
        i6m2.addChoice(i6m2c2);
        i6m2.addChoice(i6m2c3);
        i6m2.addChoice(i6m2c4);

        i6.themCauHoi(i6m1);
        i6.themCauHoi(i6m2);

        quanLyCauHoi.themCauHoi(i1);
        quanLyCauHoi.themCauHoi(i2);
        quanLyCauHoi.themCauHoi(i3);
        quanLyCauHoi.themCauHoi(i4);
        quanLyCauHoi.themCauHoi(i5);
        quanLyCauHoi.themCauHoi(i6);

//Conservation
        Conversation c1 = new Conversation("Preposition", """
                                                      Books which give instructions on how to do things are very popular in the United States today.
                                                      Thousands of these How-to books are useful. In fact, there are about four thousand books with
                                                      titles that begin with the words \u201cHow to\u201d.One book may tell you how to earn more money.
                                                      Another may tell you how to save or spend it and another may explain how to give your money away.
                                                      
                                                      Many How-to books give advice on careers. They tell you how to choose a career and \u2018now to succeed in it.
                                                      If you fail, however, you can buy the book \u201d How to Turn Failure into Success\u201d. If you would like to
                                                      become very rich, you can buy the book \u201cHow to Make a Millionaire\u201d.
                                                      If you never make any money at all, you may need a book called \u201cHow to Live on Nothing\u201d.
                                                      
                                                      One of the most popular types of books is one that helps you with personal problems. If you want
                                                      to have a better love of life, you can read \u201cHow to Succeed in Love every Minute of Your Life\u201d.
                                                      If you are tired of books on happiness, you may prefer books which give step-by-step instructions
                                                      on how to redecorate or enlarge a house.
                                                      
                                                      Why have How-to books become so popular? Probably because life has become so complex. Today people
                                                      have far more free time to use, more choices to make, and more problems to solve. How-to books help
                                                      people deal with modern life.""", 0);

        MultipleChoice c1m1 = new MultipleChoice("Preposition", "What is the passage mainly about?", 0);
        PhuongAn c1m1v1 = new PhuongAn("How to succeed in love every minute of your life.", false);
        PhuongAn c1m1v2 = new PhuongAn("How to turn failure into success.", false);
        PhuongAn c1m1v3 = new PhuongAn("How to make a millionaire.", false);
        PhuongAn c1m1v4 = new PhuongAn("How-to books.", true);
        c1m1.addChoice(c1m1v1);
        c1m1.addChoice(c1m1v2);
        c1m1.addChoice(c1m1v3);
        c1m1.addChoice(c1m1v4);

        MultipleChoice c1m2 = new MultipleChoice("Preposition", "The word “it” in paragraph 2 refers to _________", 0);
        PhuongAn c1m2v1 = new PhuongAn("advice ", false);
        PhuongAn c1m2v2 = new PhuongAn("instruction ", true);
        PhuongAn c1m2v3 = new PhuongAn("how-to books ", false);
        PhuongAn c1m2v4 = new PhuongAn("career", false);
        c1m2.addChoice(c1m2v1);
        c1m2.addChoice(c1m2v2);
        c1m2.addChoice(c1m2v3);
        c1m2.addChoice(c1m2v4);

        MultipleChoice c1m3 = new MultipleChoice("Preposition", "Which of the following is NOT the type of books giving information on careers?", 0);
        PhuongAn c1m3v1 = new PhuongAn("“How to Succeed in Love every Minute of Your Life”.", true);
        PhuongAn c1m3v2 = new PhuongAn("“How to Live on Nothing”", false);
        PhuongAn c1m3v3 = new PhuongAn("“How to Make a Millionaire”.", false);
        PhuongAn c1m3v4 = new PhuongAn("“How to Turn Failure into Success”", false);
        c1m3.addChoice(c1m3v1);
        c1m3.addChoice(c1m3v2);
        c1m3.addChoice(c1m3v3);
        c1m3.addChoice(c1m3v4);

        MultipleChoice c1m4 = new MultipleChoice("Preposition", "The word “step-by-step” in paragraph 3 is closest in meaning to", 0);
        PhuongAn c1m4v1 = new PhuongAn("little by little", false);
        PhuongAn c1m4v2 = new PhuongAn("gradually", true);
        PhuongAn c1m4v3 = new PhuongAn("slower and slower", false);
        PhuongAn c1m4v4 = new PhuongAn("A and B", false);
        c1m4.addChoice(c1m4v1);
        c1m4.addChoice(c1m4v2);
        c1m4.addChoice(c1m4v3);
        c1m4.addChoice(c1m4v4);

        MultipleChoice c1m5 = new MultipleChoice("Preposition", "It can be inferred from the passage that", 0);
        PhuongAn c1m5v1 = new PhuongAn("Today people are more bored with the modern life.", false);
        PhuongAn c1m5v2 = new PhuongAn("Modern life is more difficult to deal with.", true);
        PhuongAn c1m5v3 = new PhuongAn("Today people have fewer choices to make.", false);
        PhuongAn c1m5v4 = new PhuongAn("Today people are more interested in modern life.", false);
        c1m5.addChoice(c1m5v1);
        c1m5.addChoice(c1m5v2);
        c1m5.addChoice(c1m5v3);
        c1m5.addChoice(c1m5v4);

        c1.themCauHoi(c1m1);
        c1.themCauHoi(c1m2);
        c1.themCauHoi(c1m3);
        c1.themCauHoi(c1m4);
        c1.themCauHoi(c1m5);

        Conversation c2 = new Conversation("Linking", "Most of us tend to think of production when we think of mass media industries. After all, it\n"
                + "is the output of this production – the papers we read, the cable TV shows we watch – that grab our\n"
                + "attention, make us happy or angry, interested or bored. Moreover, most public discussion about\n"
                + "mass communication tends to be about production. The latest gossip about that actor will be in\n"
                + "what film, the angry comments a mayor makes about the violence on local TV news, the newest\n"
                + "CDs by an up-and-coming group – these are the kinds of topics that focus our attention on the\n"
                + "making of content, not its distribution or exhibition.\n"
                + "Media executives know, however, that production is only one step in the arduous and risky\n"
                + "process of getting a mass media idea to an audience. Distribution is the delivery of the produced\n"
                + "material to the point where it will be shown to its intended audience. The activity takes place out of\n"
                + "public view. We have already mentioned the NBC acts as a distributor when it disseminates\n"
                + "television programming via satellite to TV stations. When Philadelphia Newspapers Inc. delivers\n"
                + "its Philadelphia Inquirer to city newsstands, when Twentieth – Century – Fox moves its Musicland\n"
                + "stores, they are involved in distribution to exhibitions.", 2);

        MultipleChoice c2m1 = new MultipleChoice("Linking", "In this passage, “arduous” means .", 2);
        PhuongAn c2m1v1 = new PhuongAn("difficult", true);
        PhuongAn c2m1v2 = new PhuongAn("lucrative", false);
        PhuongAn c2m1v3 = new PhuongAn("lengthy", false);
        PhuongAn c2m1v4 = new PhuongAn("free", false);
        c2m1.addChoice(c2m1v1);
        c2m1.addChoice(c2m1v2);
        c2m1.addChoice(c2m1v3);
        c2m1.addChoice(c2m1v4);

        MultipleChoice c2m2 = new MultipleChoice("Linking", "The passage states that people tend to focus on production because .", 2);
        PhuongAn c2m2v1 = new PhuongAn("it takes place out of public view ", false);
        PhuongAn c2m2v2 = new PhuongAn("mass media companies do not own production divisions ", false);
        PhuongAn c2m2v3 = new PhuongAn("the output of mass media is intended to grab our attention", true);
        PhuongAn c2m2v4 = new PhuongAn("companies can function as both producers and distributors", false);
        c2m2.addChoice(c2m2v1);
        c2m2.addChoice(c2m2v2);
        c2m2.addChoice(c2m2v3);
        c2m2.addChoice(c2m2v4);

        MultipleChoice c2m3 = new MultipleChoice("Linking", "In this passage, to “disseminate” means to __ .", 2);
        PhuongAn c2m3v1 = new PhuongAn("create", false);
        PhuongAn c2m3v2 = new PhuongAn("send out", true);
        PhuongAn c2m3v3 = new PhuongAn("take in", false);
        PhuongAn c2m3v4 = new PhuongAn("fertilize", false);
        c2m3.addChoice(c2m3v1);
        c2m3.addChoice(c2m3v2);
        c2m3.addChoice(c2m3v3);
        c2m3.addChoice(c2m3v4);

        MultipleChoice c2m4 = new MultipleChoice("Linking", "This passage states that distribution is .", 2);
        PhuongAn c2m4v1 = new PhuongAn("the first step in mass media production", false);
        PhuongAn c2m4v2 = new PhuongAn("the most talked-about step in mass media production", false);
        PhuongAn c2m4v3 = new PhuongAn("at least as important as production", true);
        PhuongAn c2m4v4 = new PhuongAn("not as important as exhibition", false);
        c2m4.addChoice(c2m4v1);
        c2m4.addChoice(c2m4v2);
        c2m4.addChoice(c2m4v3);
        c2m4.addChoice(c2m4v4);

        MultipleChoice c2m5 = new MultipleChoice("Linking", "The author’s purpose in writing this passage is to .", 2);
        PhuongAn c2m5v1 = new PhuongAn("tell an interesting story", false);
        PhuongAn c2m5v2 = new PhuongAn("define a concept clearly", true);
        PhuongAn c2m5v3 = new PhuongAn("describe a scene vividly", false);
        PhuongAn c2m5v4 = new PhuongAn("argue with the reader", false);
        c2m5.addChoice(c2m5v1);
        c2m5.addChoice(c2m5v2);
        c2m5.addChoice(c2m5v3);
        c2m5.addChoice(c2m5v4);

        c2.themCauHoi(c2m1);
        c2.themCauHoi(c2m2);
        c2.themCauHoi(c2m3);
        c2.themCauHoi(c2m4);
        c2.themCauHoi(c2m5);

        Conversation c3 = new Conversation("Linking", """
                                                            When we were in England last year, I went fishing with my friend, Peter. Early in the
                                                            morning we were sitting quietly by the side of the lake when we had an unpleasant surprise. We
                                                            saw a duck come along with three ducklings padding cheerfully behind her. As we watched them,
                                                            there was a sudden swirl in the water. We caught a glimpse of the vicious jaws of a pike \u2013 a fish
                                                            which is rather like a freshwater shark \u2013 and one of the ducklings was dragged below the surface.
                                                            This incident made Peter furious. He vowed to catch the pike. On three successive
                                                            mornings we returned to the vicinity and used several different kinds of bait. On the third day
                                                            Peter was lucky. Using an artificial frog as bait, he managed to hook the monster. There was a
                                                            desperate fight but Peter was determined to capture the pike and succeeded. When he had got it
                                                            ashore and killed it, he wieghed the fish and found that it scaled nearly thirty pounds
                                                            \u2013 a record for that district.""", 1);

        MultipleChoice c3m1 = new MultipleChoice("Linking", "Why do you think Peter was sitting quietly by the lake?", 1);
        PhuongAn c3m1v1 = new PhuongAn("He was watching the ducks.", false);
        PhuongAn c3m1v2 = new PhuongAn("He wasn’t very talkative.", false);
        PhuongAn c3m1v3 = new PhuongAn("He was waiting for the pike to appear.", false);
        PhuongAn c3m1v4 = new PhuongAn("He was fishing", true);
        c3m1.addChoice(c3m1v1);
        c3m1.addChoice(c3m1v2);
        c3m1.addChoice(c3m1v3);
        c3m1.addChoice(c3m1v4);

        MultipleChoice c3m2 = new MultipleChoice("Linking", "To what does surprise in line 3 probably refer?", 1);
        PhuongAn c3m2v1 = new PhuongAn("to the duck.", false);
        PhuongAn c3m2v2 = new PhuongAn("to the ducklings.", false);
        PhuongAn c3m2v3 = new PhuongAn("to the action of the pike.", true);
        PhuongAn c3m2v4 = new PhuongAn("to the time of the day", false);
        c3m2.addChoice(c3m2v1);
        c3m2.addChoice(c3m2v2);
        c3m2.addChoice(c3m2v3);
        c3m2.addChoice(c3m2v4);

        MultipleChoice c3m3 = new MultipleChoice("Linking", "What were Peter’s feelings about the incident two days later?", 1);
        PhuongAn c3m3v1 = new PhuongAn("He caught and killed the pike.", false);
        PhuongAn c3m3v2 = new PhuongAn("He vowed that he would catch the remaining ducklings", true);
        PhuongAn c3m3v3 = new PhuongAn("He remained determined to catch the pike.", false);
        PhuongAn c3m3v4 = new PhuongAn("He caught a frog and used it as bait for the pike.", false);
        c3m3.addChoice(c3m3v1);
        c3m3.addChoice(c3m3v2);
        c3m3.addChoice(c3m3v3);
        c3m3.addChoice(c3m3v4);

        MultipleChoice c3m4 = new MultipleChoice("Linking", "How much was the pike worth?", 1);
        PhuongAn c3m4v1 = new PhuongAn("about thirty pounds.", false);
        PhuongAn c3m4v2 = new PhuongAn("about two hundred and forty dollars.", false);
        PhuongAn c3m4v3 = new PhuongAn("the passage contains no information on this point.", true);
        PhuongAn c3m4v4 = new PhuongAn("the passage says that the fish scaled nearly thirty pound.", false);
        c3m4.addChoice(c3m4v1);
        c3m4.addChoice(c3m4v2);
        c3m4.addChoice(c3m4v3);
        c3m4.addChoice(c3m4v4);

        MultipleChoice c3m5 = new MultipleChoice("Linking", "Which of the following titles best sums up the whole passage?", 1);
        PhuongAn c3m5v1 = new PhuongAn("Mysterious disappearance of ducklings.", false);
        PhuongAn c3m5v2 = new PhuongAn("Revenge on a duck.", true);
        PhuongAn c3m5v3 = new PhuongAn("Record pike caught by an angry fisherman.", false);
        PhuongAn c3m5v4 = new PhuongAn("Huge pike caught by fisherman after desperate struggle atsea.", false);
        c3m5.addChoice(c3m5v1);
        c3m5.addChoice(c3m5v2);
        c3m5.addChoice(c3m5v3);
        c3m5.addChoice(c3m5v4);

        c3.themCauHoi(c3m1);
        c3.themCauHoi(c3m2);
        c3.themCauHoi(c3m3);
        c3.themCauHoi(c3m4);
        c3.themCauHoi(c3m5);

        quanLyCauHoi.themCauHoi(c1);
        quanLyCauHoi.themCauHoi(c3);
        quanLyCauHoi.themCauHoi(c2);

        int chonMenuChinh, chonDangCauHoi, chonQuanLyCauHoi, chonHocVien;
        boolean mainThread, threadLamBai, threadCauHoi, threadHocVien;

        mainThread = true;

        //MENU CHÍNH
        while (mainThread) {
            threadHocVien = threadLamBai = threadCauHoi = true;
//            xuatMenuChinh:
            menuChinh();
            chonMenuChinh = CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();
            switch (chonMenuChinh) {

                case 1:
                    while (threadHocVien) {
                        menuHocVien();
                        chonHocVien = Integer.parseInt(CauHinh.sc.nextLine());

                        switch (chonHocVien) {
                            case 1:
                                System.out.print("\n--- NHAP THONG TIN HOC VIEN MOI --");
                                HocVien hv = new HocVien();
                                try {
                                    hv.nhapThongTin();
                                    hv.setThanhTich(new ThanhTich());
                                    quanLyHocVien.them(hv);
                                    System.out.println("=> THEM THANH VIEN THANH CONG!");
                                } catch (ParseException e) {
                                    System.out.println("Du lieu khong hop le!");
                                }
                                break;
                            case 2:
                                System.out.println("Danh sach hoc vien la: ");
                                quanLyHocVien.xuatDanhSachHv();
                                break;
                            case 3:
                                System.out.println("\nCap nhat thong tin hoc vien");
                                quanLyHocVien.xuatDanhSachHv();
                                System.out.print("Nhap ma hoc vien muon cap nhat: ");
                                int maHV = Integer.parseInt(sc.nextLine());
                                HocVien tv = quanLyHocVien.traCuu(maHV);
                                if (tv != null) {
                                    try {
                                        tv.nhapThongTin();
                                        System.out.println("Cap nhat thanh cong!");
                                    } catch (ParseException e) {
                                        System.out.println("Du lieu khong hop le!");
                                    }
                                } else {
                                    System.out.println("Khong tim thay hoc vien!");
                                }
                                break;
                            case 4:
                                System.out.println("\nXoa thong tin hoc vien");
                                quanLyHocVien.xuatDanhSachHv();
                                System.out.print("Nhap ma hoc vien muon xoa: ");
                                int maHVXoa = Integer.parseInt(CauHinh.sc.nextLine());
                                HocVien hvXoa = quanLyHocVien.traCuu(maHVXoa);
                                if (hvXoa != null) {
                                    quanLyHocVien.xoa(hvXoa);
                                    System.out.println("Xoa hoc vien thanh cong!");
                                } else {
                                    System.out.println("Khong tim thay hoc vien!");
                                }
                                break;
                            case 5:
                                System.out.print("Nhap ngay sinh can tra cuu: ");
                                try {
                                    Date ngaySinh = f.parse(CauHinh.sc.nextLine());
                                    System.out.println("---- DANH SACH HOC VIEN TRA CUU THEO NGAY SINH ----");
                                    List<HocVien> dsHocVienTheoNgaySinh = quanLyHocVien.traCuu(ngaySinh);
                                    quanLyHocVien.xuatDanhSachHv(dsHocVienTheoNgaySinh);
                                } catch (ParseException e) {
                                    System.out.println("Du lieu khong hop le!");
                                }
                                break;
                            case 6:
                                System.out.print("Nhap tu khoa can tra cuu (Ho Ten, gioi tinh, que quan): ");
                                String tuKhoa = CauHinh.sc.nextLine();
                                System.out.println("----- DANH SACH TRA CUU DUOC -----");
                                List<HocVien> dsTraCuu = quanLyHocVien.traCuu(tuKhoa);
                                quanLyHocVien.xuatDanhSachHv(dsTraCuu);
                                break;
                            case 0:
                                threadHocVien = false;
                                break;
                            default:
                                System.out.println("LOI!");
                                break;
                        }
                    }
                    break;
                //QUẢN LÝ CÂU HỎI
                case 2:
                    while (threadCauHoi) {
                        menuQuanLyCauHoi();
                        chonQuanLyCauHoi = CauHinh.sc.nextInt();

                        switch (chonQuanLyCauHoi) {
                            case 1:
                                quanLyCauHoi.xuatNoiDung();
                                break;
                            case 2:
                                System.out.print("\nNoi dung can tra cuu: ");
                                sc.nextLine();
                                String noiDungTraCuu = CauHinh.sc.nextLine();
                                quanLyCauHoi.traCuuTheoNoiDung(noiDungTraCuu).xuatNoiDung();
                                break;
                            case 3:
                                System.out.print("\nDanh muc can tra cuu: ");
                                sc.nextLine();
                                String danhMucTraCuu = CauHinh.sc.nextLine();
                                quanLyCauHoi.traCuuTheoDanhMuc(danhMucTraCuu).xuatNoiDung();
                                break;
                            case 4:
                                System.out.print("\nMuc do can tra cuu (De: 0, Trung Binh: 1, Kho: 2): ");
                                int doKhoTraCuu = Integer.parseInt(CauHinh.sc.nextLine());
                                quanLyCauHoi.traCuuTheoDoKho(doKhoTraCuu).xuatNoiDung();
                                break;
                            case 0:
                                threadCauHoi = false;
                                break;
                            default:
                                System.out.println("LOI !!!");
                                break;
                        }
                    }
                    break;

                case 3:
                    while (threadLamBai) {
                        menuChonCauHoi();
                        chonDangCauHoi = Integer.parseInt(CauHinh.sc.nextLine());

                        switch (chonDangCauHoi) {
                            case 1:
                                int soCauMultiple;
                                System.out.print("So luong cau hoi muon lam: ");
                                soCauMultiple = Integer.parseInt(CauHinh.sc.nextLine());

                                if (soCauMultiple > quanLyCauHoi.soLuongMultipleChoice()) {
                                    System.out.println("\nSo luong cau hoi co san khong du!!");
                                } else {
                                    quanLyCauHoi.ngauNhienMultipleChoice(0).hienThi();
                                    quanLyCauHoi.danhSachTheoMultipleChoice(soCauMultiple - 1).hienThi();
                                }
                                break;

                            case 2:
                                int doKho;
                                System.out.print("Muc Do (De: 0, Trung Binh: 1, Kho: 2): ");
                                doKho = Integer.parseInt(CauHinh.sc.nextLine());

                                quanLyCauHoi.ngauNhienInComplete(doKho).hienThi();
                                break;

                            case 3:
                                int dKho;
                                System.out.print("Muc Do (De: 0, Trung Binh: 1, Kho: 2): ");
                                dKho = Integer.parseInt(CauHinh.sc.nextLine());

                                quanLyCauHoi.ngauNhienConversation(dKho).hienThi();
                                break;

                            case 0:
                                threadLamBai = false;
                                break;

                            default:
                                System.out.println("LOI !!!");
                                break;
                        }
                    }
                    break;

                case 0:
                    mainThread = false;
                    break;
                default:
                    System.out.println("LOI !!!");
                    break;
            }
        }
    }

    /**
     * Menu
     */
    public static void menuChinh() {
        System.out.println("\n\n----------- MENU ------------");
        System.out.println("1. Quan li hoc vien");
        System.out.println("2. Quan li cau hoi");
        System.out.println("3. Luyen Tap");
        System.out.println("4. Thong ke ket qua cua 1 hoc vien");
        System.out.println("0. Thoat!");
        System.out.println("-------------------------------");
        System.out.print("Chon chuc nang: ");
    }

    public static void menuHocVien() {
        System.out.println("\n\n----------- MENU QUAN LY HOC VIEN ------------");
        System.out.println("1. Them hoc vien moi");
        System.out.println("2. Xem danh sach hoc vien");
        System.out.println("3. Cap nhat thong tin hoc vien");
        System.out.println("4. Xoa thong tin hoc vien");
        System.out.println("5. Tra cuu hoc vien theo ngay sinh");
        System.out.println("6. Tra cuu hoc vien theo ten, gioi tinh, que quan");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("--------------------------------------------------");
        System.out.print("Chon chuc nang: ");
    }

    public static void menuQuanLyCauHoi() {
        System.out.println("\n\n----------- MENU QUAN LI CAU HOI ------------");
        System.out.println("1. Xuat danh sach cau hoi");
        System.out.println("2. Tra cuu theo noi dung");
        System.out.println("3. Tra cuu theo danh muc");
        System.out.println("4. Tra cuu theo muc do");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("---------------------------");
        System.out.print("Lua chon: ");
    }

    public static void menuChonCauHoi() {
        System.out.println("\n\n----------- MENU CHON LOAI CAU HOI ------------");
        System.out.println("1. MultipleChoice");
        System.out.println("2. InComplete");
        System.out.println("3. Conversation");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("---------------------------");
        System.out.print("Lua chon: ");
    }
}
